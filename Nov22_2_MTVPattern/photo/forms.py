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
        
        
# Django�� ModelForm�̶�� ���� ��ӹ޾� ���� �ʵ尪�� �Է����� �޴� PhotoForm Ŭ������ ���� 
#  
# 
# 
# 