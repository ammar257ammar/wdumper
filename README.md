# WDumper [![](https://github.com/bennofs/wdumper/workflows/Java%20CI/badge.svg?branch=master)](https://github.com/bennofs/wdumper/actions)
_A tool to create customized Wikidata RDF dumps_

This project contains the source code for the application running at https://tools.wmflabs.org/wdumps.

## Using the Docker

This fork's docker is available through DockerHub so need need to build it in order to use it.

Use the Wdumper Docker like this:

```
docker run -it --rm --name wdumper -v YOUR_DATA_PATH_HERE:/data -e DUMPS_PATH=/data  aammar/wdumper /data/wikidata_dump.json.gz /data/specs.json
```
