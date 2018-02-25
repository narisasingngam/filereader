# filereader
by Narisa Singnam 6010545820

Read file 1 chars at time to String         in sec 1.215100

Read file 1 chars at time to StringBuilder  in sec 0.020652

Read file line at time using BufferedReader in sec 0.038246

## Explain why some tasks are slower than other.
String is slower than StringBuilder because StringBuilder collect in array that it can merge the word immediately but String will create a new string which take more time.
