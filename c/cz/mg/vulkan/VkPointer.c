#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPointer_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(void*);
}

jlong Java_cz_mg_vulkan_vk_VkPointer_getValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    void** pointerAddress = (void**)jniLongToPointer(address);
    return jniPointerToLong(*pointerAddress);
}

void Java_cz_mg_vulkan_vk_VkPointer_setValue(JNIEnv* env, jclass jc, jlong address, jlong value)
{
    (void)env;
    (void)jc;
    void** pointerAddress = (void**)jniLongToPointer(address);
    *pointerAddress = jniLongToPointer(value);
}

jlong Java_cz_mg_vulkan_vk_VkPointer_getNullValue(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return jniPointerToLong(NULL);
}

void* null;

jlong Java_cz_mg_vulkan_vk_VkPointer_getNullAddress(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    null = NULL;
    return jniPointerToLong(&null);
}
