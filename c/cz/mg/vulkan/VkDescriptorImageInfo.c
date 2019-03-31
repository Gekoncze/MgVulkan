#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDescriptorImageInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorImageInfo);
}

jlong Java_cz_mg_vulkan_vk_VkDescriptorImageInfo_getSampler(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorImageInfo* o = (VkDescriptorImageInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sampler));
}

void Java_cz_mg_vulkan_vk_VkDescriptorImageInfo_setSampler(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorImageInfo* o = (VkDescriptorImageInfo*)jniLongToPointer(address);
    memcpy(&o->sampler, jniLongToPointer(valueAddress), sizeof(o->sampler));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorImageInfo_getImageView(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorImageInfo* o = (VkDescriptorImageInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageView));
}

void Java_cz_mg_vulkan_vk_VkDescriptorImageInfo_setImageView(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorImageInfo* o = (VkDescriptorImageInfo*)jniLongToPointer(address);
    memcpy(&o->imageView, jniLongToPointer(valueAddress), sizeof(o->imageView));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorImageInfo_getImageLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorImageInfo* o = (VkDescriptorImageInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageLayout));
}

void Java_cz_mg_vulkan_vk_VkDescriptorImageInfo_setImageLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorImageInfo* o = (VkDescriptorImageInfo*)jniLongToPointer(address);
    memcpy(&o->imageLayout, jniLongToPointer(valueAddress), sizeof(o->imageLayout));
}

