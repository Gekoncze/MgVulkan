#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPointer_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(void*);
}

jlong Java_cz_mg_vulkan_VkPointer_plus(JNIEnv* env, jclass jc, jlong address, jlong offset)
{
    (void)env;
    (void)jc;
    return jniPointerToLong(jniLongToPointer(address) + offset);
}

jlong Java_cz_mg_vulkan_VkPointer_getValueNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    void** pointerAddress = (void**)jniLongToPointer(address);
    return jniPointerToLong(*pointerAddress);
}

void Java_cz_mg_vulkan_VkPointer_setValueNative(JNIEnv* env, jclass jc, jlong address, jlong value)
{
    (void)env;
    (void)jc;
    void** pointerAddress = (void**)jniLongToPointer(address);
    *pointerAddress = jniLongToPointer(value);
}

jlong Java_cz_mg_vulkan_VkPointer_getNullValueNative(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return jniPointerToLong(NULL);
}

void* null;

jlong Java_cz_mg_vulkan_VkPointer_getNullAddressNative(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    null = NULL;
    return jniPointerToLong(&null);
}

void* sink;

jlong Java_cz_mg_vulkan_VkPointer_getSinkAddressNative(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return jniPointerToLong(&sink);
}
