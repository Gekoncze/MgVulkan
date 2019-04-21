#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImageFormatProperties2_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageFormatProperties2);
}

jlong Java_cz_mg_vulkan_VkImageFormatProperties2_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties2* o = (VkImageFormatProperties2*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkImageFormatProperties2_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties2* o = (VkImageFormatProperties2*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkImageFormatProperties2_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties2* o = (VkImageFormatProperties2*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkImageFormatProperties2_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties2* o = (VkImageFormatProperties2*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkImageFormatProperties2_getImageFormatProperties(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties2* o = (VkImageFormatProperties2*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageFormatProperties);
}

void Java_cz_mg_vulkan_VkImageFormatProperties2_setImageFormatProperties(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatProperties2* o = (VkImageFormatProperties2*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageFormatProperties, valuePointer, sizeof(o->imageFormatProperties));
}


