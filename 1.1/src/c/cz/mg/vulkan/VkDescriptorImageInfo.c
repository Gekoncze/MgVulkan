#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDescriptorImageInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorImageInfo);
}

jlong Java_cz_mg_vulkan_VkDescriptorImageInfo_getSamplerNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorImageInfo* o = (VkDescriptorImageInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sampler);
}

void Java_cz_mg_vulkan_VkDescriptorImageInfo_setSamplerNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorImageInfo* o = (VkDescriptorImageInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sampler, valuePointer, sizeof(o->sampler));
}

jlong Java_cz_mg_vulkan_VkDescriptorImageInfo_getImageViewNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorImageInfo* o = (VkDescriptorImageInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageView);
}

void Java_cz_mg_vulkan_VkDescriptorImageInfo_setImageViewNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorImageInfo* o = (VkDescriptorImageInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageView, valuePointer, sizeof(o->imageView));
}

jlong Java_cz_mg_vulkan_VkDescriptorImageInfo_getImageLayoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorImageInfo* o = (VkDescriptorImageInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageLayout);
}

void Java_cz_mg_vulkan_VkDescriptorImageInfo_setImageLayoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorImageInfo* o = (VkDescriptorImageInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageLayout, valuePointer, sizeof(o->imageLayout));
}


