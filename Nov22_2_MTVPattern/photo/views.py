from django.shortcuts import render, get_object_or_404
from .models import Photo
from django.urls.conf import path
from pathlib import Path
from django.template.context_processors import request

# View
# Template�� Model ���̸� �̾��ִ� �ٸ����� 


# objects.all()�� ���� Photo �� ������ ��ü�� ������
# render ������ �Ķ���Ϳ� �ִ� {}�� Ȱ���ϸ� ���ø����� �����͸� ���� ���� ����
# {}�ȿ� �ְ��� �ϴ� �����͸� �������� �̸��� �Բ� ���� 
# �� �κ��� Django���� �����ϴ� ORM(Object Relational Mapping)

# def photo_list(request):
#     photos = Photo.objects.all()
#     return render(request, 'photo/photo_list.html', {'photos' : photos})

def photo_detail(request, pk):
    photo = get_object_or_404(Photo, pk=pk)
    return render(request, 'photo/photo_detail.html', {'photo' : photo})
    
# get_object_or_404()�� �𵨷κ��� �����͸� ã�ƺ��� ã�� �����Ͱ� ���ٸ� 404������ ��ȯ�ϴ� �Լ�
# pk(primary key)
#    : mmodel���� �� �� ���� ������ ��ü���� ������ �� �ִ� ������
#    

urlpatterns = [
    # views.py�� �ִ� photo_list �Լ��� �ҷ��°�,
    # photo/photo_list.html�� �������� ����
    path('', views.photo_list, name="photo_list"),
    
    # ���⼭ pk��� �̸��� ������ ������ �� �ڸ��� �ǹ�(�����ϰ� �����͸� ������ �� ����)
    path = ('photo/<int:pk>', views.photo_detail, name="photo_detail")
    
    
    ]
    
    
def photo_post(request):
    if request.method == "POST":
        form = PhotoForm(request.POST)
        if form.is_valid():
            photo = form.save(commit = False)
            photo.save()
            return redirect('photo_detail', pk=photo.pk)
    else:
        form = PhotoForm()
    return render(request, 'photo/photo_post.html', {'form':form})
    
    # ���⼭ pk��� �̸��� ������ ������ �� �ڸ��� �ǹ�(�����ϰ� �����͸� ������ �� ����)
    path('photo/<int:pk>', views.photo_detail, name="photo_detail"),
    
    path('photo/new/')
    
    
