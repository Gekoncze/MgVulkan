#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDescriptorPoolSize_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorPoolSize);
}

jlong Java_cz_mg_vulkan_vk_VkDescriptorPoolSize_getType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolSize* o = (VkDescriptorPoolSize*)jniLongToPointer(address);
    return jniPointerToLong(&(o->type));
}

void Java_cz_mg_vulkan_vk_VkDescriptorPoolSize_setType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolSize* o = (VkDescriptorPoolSize*)jniLongToPointer(address);
    memcpy(&o->type, jniLongToPointer(valueAddress), sizeof(o->type));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorPoolSize_getDescriptorCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolSize* o = (VkDescriptorPoolSize*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorCount));
}

void Java_cz_mg_vulkan_vk_VkDescriptorPoolSize_setDescriptorCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolSize* o = (VkDescriptorPoolSize*)jniLongToPointer(address);
    memcpy(&o->descriptorCount, jniLongToPointer(valueAddress), sizeof(o->descriptorCount));
}

