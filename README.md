# iperf3parser

Parser for JSON output from iperf3

### Overview

This program can read iperf3 (version 3.9) JSON outputs so you are able to quickly get some information from that. The program ignores non `.json` files and as an output produce `.csv` files with sample part of iperf3 output.

### Example JAR

To test parsing your JSONs files you can simply run `.jar` file from [there](https://mega.nz/file/MX4mDaTZ#YPqBtO4_1dCMe3LbFccIBo9C9aiKIkHZqpR0dALps5M).
To do this (on Linux) type in terminal:
```
java -jar iperf3parser.jar <your_file.json> <another_file.json>
```
As a result on your disk will show up `.csv` files with "start", "bits_per_seconds" and "retransmits" sections from "intervals".

### Used library

I have used a [Jackson](https://github.com/FasterXML/jackson-module-kotlin) to read JSON files.

### License (apart from Jackson)

[GNU GENERAL PUBLIC LICENSE](LICENSE)

