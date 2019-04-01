#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkCopyDescriptorSet);
}

jlong Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_getSrcSet(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcSet);
}

void Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_setSrcSet(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcSet, valuePointer, sizeof(o->srcSet));
}

jlong Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_getSrcBinding(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcBinding);
}

void Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_setSrcBinding(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcBinding, valuePointer, sizeof(o->srcBinding));
}

jlong Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_getSrcArrayElement(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcArrayElement);
}

void Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_setSrcArrayElement(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcArrayElement, valuePointer, sizeof(o->srcArrayElement));
}

jlong Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_getDstSet(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstSet);
}

void Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_setDstSet(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstSet, valuePointer, sizeof(o->dstSet));
}

jlong Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_getDstBinding(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstBinding);
}

void Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_setDstBinding(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstBinding, valuePointer, sizeof(o->dstBinding));
}

jlong Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_getDstArrayElement(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstArrayElement);
}

void Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_setDstArrayElement(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstArrayElement, valuePointer, sizeof(o->dstArrayElement));
}

jlong Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_getDescriptorCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorCount);
}

void Java_cz_mg_vulkan_vk_VkCopyDescriptorSet_setDescriptorCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorCount, valuePointer, sizeof(o->descriptorCount));
}


