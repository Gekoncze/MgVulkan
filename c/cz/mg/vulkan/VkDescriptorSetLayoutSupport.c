#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutSupport_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorSetLayoutSupport);
}

jlong Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutSupport_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutSupport* o = (VkDescriptorSetLayoutSupport*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutSupport_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutSupport* o = (VkDescriptorSetLayoutSupport*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutSupport_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutSupport* o = (VkDescriptorSetLayoutSupport*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutSupport_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutSupport* o = (VkDescriptorSetLayoutSupport*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutSupport_getSupported(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutSupport* o = (VkDescriptorSetLayoutSupport*)jniLongToPointer(address);
    return jniPointerToLong(&(o->supported));
}

void Java_cz_mg_vulkan_vk_VkDescriptorSetLayoutSupport_setSupported(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorSetLayoutSupport* o = (VkDescriptorSetLayoutSupport*)jniLongToPointer(address);
    memcpy(&o->supported, jniLongToPointer(valueAddress), sizeof(o->supported));
}

