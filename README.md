# manage-screenshots
Create directories for every when screenshots were taken on my machine, and place the images in the corresponding directories.
Relies on images having the format 
`Screenshot from yyyy-MM-dd HH-mm-ss.png`

MM/dd/yyyy HH:mm:ss
10/03/2017 07:29:46 

Needs [babashka](https://github.com/borkdude/babashka) to run.

```
mic@mic:~/screenshots$ ls
'Screenshot from 2019-01-22 19-47-14.png'  'Screenshot from 2019-02-13 12-06-30.png'  'Screenshot from 2019-06-04 16-30-14.png'
'Screenshot from 2019-01-25 11-10-23.png'  'Screenshot from 2019-02-13 13-41-57.png'  'Screenshot from 2019-06-04 16-30-44.png'
'Screenshot from 2019-01-25 11-10-46.png'  'Screenshot from 2019-02-13 13-48-56.png'  'Screenshot from 2019-06-04 16-30-52.png'
'Screenshot from 2019-01-25 11-12-44.png'  'Screenshot from 2019-02-13 13-52-29.png'  'Screenshot from 2019-06-04 16-30-56.png'
'Screenshot from 2019-01-25 21-12-02.png'  'Screenshot from 2019-02-13 13-52-37.png'  'Screenshot from 2019-06-04 16-31-07.png'
'Screenshot from 2019-02-13 12-05-12.png'  'Screenshot from 2019-06-04 15-24-20.png'  'Screenshot from 2019-06-04 19-21-35.png'
'Screenshot from 2019-02-13 12-05-20.png'  'Screenshot from 2019-06-04 15-24-33.png'  'Screenshot from 2019-06-04 23-23-02.png'
mic@mic:~/screenshots$ manage-screenshots.bb 
./2019-01-25 - 4 images
./2019-02-13 - 7 images
./2019-06-04 - 9 images
./2019-01-22 - 1 image
mic@mic:~/screenshots$ ls
2019-01-22  2019-01-25  2019-02-13  2019-06-04
mic@mic:~/screenshots$ ls 2019-01-25/
'Screenshot from 2019-01-25 11-10-23.png'  'Screenshot from 2019-01-25 11-12-44.png'
'Screenshot from 2019-01-25 11-10-46.png'  'Screenshot from 2019-01-25 21-12-02.png'
```
