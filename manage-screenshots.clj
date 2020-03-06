#!/usr/bin/env bb

(defn move-files [[date files]]
  (let [dir-name-to-log (str (.getParent (first files)) "/" date)]
    (io/make-parents (str (.getParent (first files)) "/" date "/anything"))
    (println (str dir-name-to-log " - " (count files) (if (= 1 (count files)) " image" " images"))))
  (doseq [file files]
    (let [parent           (.getParent file)
          filename         (.getName file)
          destination-path (str parent "/" date "/" filename)]
      (.renameTo file (io/file destination-path)))))

(defn move-screenshots []
  (let [all-files-in-current-dir (-> "." io/file file-seq)
        current-dir-path         (.getCanonicalPath (first all-files-in-current-dir))
        files-to-move-from-current-dir
        (->> all-files-in-current-dir
             (filter #(re-find (re-pattern
                                (str current-dir-path "/"
                                     "Screenshot from \\d{4,4}-\\d{2,2}-\\d{2,2} \\d{2,2}-\\d{2,2}-\\d{2,2}\\.png"))
                               (.getCanonicalPath %)))
             (group-by #(subs (.getCanonicalPath %)
                              (count (str current-dir-path "/Screenshot from "))
                              (count (str current-dir-path "/Screenshot from 9999-99-99")))))]
    (doseq [file-group files-to-move-from-current-dir]
      (move-files file-group))))

(move-screenshots)
