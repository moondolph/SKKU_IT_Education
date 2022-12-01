from django.contrib import admin
from .models import Photo #Photo를 import하면서, Photo의 models.py를 불러옴

# 모델 등록하기
# Register your models here.

# admin.site.register()를 통해 admin페이지에 Photo 모델을 등록
admin.site.register(Photo)




