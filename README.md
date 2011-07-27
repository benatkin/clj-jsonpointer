# jsonpointer

This is the beginning of a small library for working with 
[json pointers](http://tools.ietf.org/html/draft-pbryan-zyp-json-pointer-00).

A JSON pointer is a list of keys separated by a `/`. After the split, the keys
are URL decoded. The main things to remember when writing out a JSONPointer
are:

*   If a key conttains a forward slash (`/`), replace it with `%2F` so it
    doesn't get split. The `%2F` will be replaced with a `/` after splitting
    the JSONPointer expression into keys.
*   If a key contains a percent sign (`%`), replace it with `%25` so it gets
    decoded into a `%` sign.

## Usage

To split a jsonpointer string:

``` clojure
(jsonpointer/split "src%2Fjsonpointer.clj/size")  ; => ("src/jsonpointer.clj" "size")
```

## License

Copyright (c) 2011 by Ben Atkin

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.