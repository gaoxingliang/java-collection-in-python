# how to release new version?
see [ref](https://packaging.python.org/en/latest/tutorials/packaging-projects/)
```
python3 -m build
python3 -m twine upload --repository pypi dist/*
```

use the api token from user: scugxl :<br>
https://pypi.org/manage/account/token/

