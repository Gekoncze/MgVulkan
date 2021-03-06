#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

#include <string.h>
#include <stdio.h>

jlong jniPointerToLong(const void* p)
{
    if(sizeof(void*) > sizeof(jlong)) return 0;
    jlong l;
    memcpy(&l, &p, sizeof(void*));
    return l;
}

void* jniLongToPointer(jlong l)
{
    if(sizeof(void*) > sizeof(jlong)) return 0;
    void* p;
    memcpy(&p, &l, sizeof(void*));
    return p;
}

jlong jniFunctionPointerToLong(PFN_vkVoidFunction p)
{
    if(sizeof(PFN_vkVoidFunction) > sizeof(jlong)) return 0;
    jlong l;
    memcpy(&l, &p, sizeof(PFN_vkVoidFunction));
    return l;
}

PFN_vkVoidFunction jniLongToFunctionPointer(jlong l)
{
    if(sizeof(PFN_vkVoidFunction) > sizeof(jlong)) return 0;
    PFN_vkVoidFunction p;
    memcpy(&p, &l, sizeof(PFN_vkVoidFunction));
    return p;
}

void jniThrowException(JNIEnv* env, const char* message)
{
    jclass c = (*env)->FindClass(env, "java/lang/RuntimeException");
    (*env)->ThrowNew(env, c, message);
}
