# avatar

Utility for generating 256x256 png image from first character 

## Usage

```shell
curl -s -L http://goo.gl/hHAiyV -o /tmp/avatar.jar; java -cp /tmp/avatar.jar app.App Adam John Jack Sara
```

## Sample output

![alt text](https://raw.githubusercontent.com/masgari/avatar/master/samples.png "Samples")

## Reading names from a url

```shell
 java -cp avatar.jar app.App $(curl -s http://deron.meranda.us/data/census-derived-all-first.txt | head -n 16 | awk '{print $1}' ORS=' ')
```
