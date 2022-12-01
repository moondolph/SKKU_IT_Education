from django.db import models

#����� model field
#    1. CharField : ���� ���ڿ� ����
#               �ݵ�� �ִ� ���̸� max-length �ɼǿ� ���� !
#    2. EmailField : �̸��� �ּ� ���¸� ���� �� ���
#    3. URLField : URL �ּ� ���¸� ���� �� ��� 
#    4. TextField : ��뷮 ���ڿ��� ó���ϴ� �ʵ�, ũ�� ������ ���� �� �ʿ� ����
#    5. IntergerField : ������ �ʵ�
#    6. BooleanField : True Ȥ�� False�� �����ϴ� �ʵ�
#            Null�� ����ϱ� ���ؼ��� NullBooleanField�� ���
#    7. DatetimeField : �ð��� ���õ� ���� �����ϴ� �ʵ�
#                ���� �ڵ����� ���� �ð��븦 �ְ� �ִٸ� auto_now     = True�� �ɼ� 
#                auto_now �ɼ� : save �� ������ ���� �ð��� ����
#                auto_now_add �ɼ� : �� ó�� ������ ���� ��¥�� ����
#    8. DecimalField : �Ҽ��� ���� �ʵ� 
#        ǥ���� �� �ִ� ������ �ڸ���(max_digits)�� �Ҽ����� ��ġ(decimal_places)�� ����!
#    9. FileField : ������ ���ε��ϴ� �ʵ� 
#         upload_to �ɼǿ� �ݵ�� �ش� ��θ� �����ؾ�!
#         ��� Ž���� ������ settings.py�� �����س��Ҵ� MEDIA_ROOT ��ο������� ���� 
#################################################################################
# Create your models here
class Photo(models.Model):
    title = models.CharField(max_length=50) 
    author = models.CharField(max_length=50) 
    image = models.CharField(max_length=1000) 
    description = models.TextField() 
    price = models.IntegerField()


# Django���� Model Ŭ������ �����ϰ� �� ��, DB�� ������ų �� �ֵ��� 
#    �ش� �𵨿� �ش��ϴ� ���̺��� �Ȱ��� ������ ����� ��!
# Python�� �� Ŭ������ ���� (�� ����)�� DB�� �����ϴ� ������ Migration�̶�� ��

# 1. make migrations 
# Ư�� ���� ���� �ľ��Ͽ� ���̺� ��Ű���� ���� or ������ ���� ������ ������
# �ʿ��� �ʵ尡 ����ų�, �����ؾ� �� �ʵ尡 �����, �ݵ�� ���ο� ������ �������� �� 
# *** �� ��ɾ �����ϱ� ���ؼ��� settings.py ������ INSTALLED_APPS�� �ش� ���� �̸��� �߰��Ǿ��־�� ��!!!!!

# 2. migrate
# �� Ŭ������ ����, ������ DB ���̺��� ���� or �����ϴ� ��ɾ�
# 
# 


