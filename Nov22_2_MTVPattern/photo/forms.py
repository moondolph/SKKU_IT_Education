from django import forms
from .models import Photo

class PhotoForm(forms.ModelForm):
    class Meta:
        model = Photo
        fields = (
            'title',
            'author',
            'image',
            'description',
            'price',
            )
        
        
# Django의 ModelForm이라는 것을 상속받아 위의 필드값을 입력으로 받는 PhotoForm 클래스를 생성 
#  
# 
# 
# 