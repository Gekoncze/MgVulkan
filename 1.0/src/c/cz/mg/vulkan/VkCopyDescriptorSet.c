#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkCopyDescriptorSet_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkCopyDescriptorSet);
}

jlong Java_cz_mg_vulkan_VkCopyDescriptorSet_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkCopyDescriptorSet_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkCopyDescriptorSet_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkCopyDescriptorSet_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkCopyDescriptorSet_getSrcSetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcSet);
}

void Java_cz_mg_vulkan_VkCopyDescriptorSet_setSrcSetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcSet, valuePointer, sizeof(o->srcSet));
}

jlong Java_cz_mg_vulkan_VkCopyDescriptorSet_getSrcBindingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcBinding);
}

void Java_cz_mg_vulkan_VkCopyDescriptorSet_setSrcBindingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcBinding, valuePointer, sizeof(o->srcBinding));
}

jlong Java_cz_mg_vulkan_VkCopyDescriptorSet_getSrcArrayElementNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcArrayElement);
}

void Java_cz_mg_vulkan_VkCopyDescriptorSet_setSrcArrayElementNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcArrayElement, valuePointer, sizeof(o->srcArrayElement));
}

jlong Java_cz_mg_vulkan_VkCopyDescriptorSet_getDstSetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstSet);
}

void Java_cz_mg_vulkan_VkCopyDescriptorSet_setDstSetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstSet, valuePointer, sizeof(o->dstSet));
}

jlong Java_cz_mg_vulkan_VkCopyDescriptorSet_getDstBindingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstBinding);
}

void Java_cz_mg_vulkan_VkCopyDescriptorSet_setDstBindingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstBinding, valuePointer, sizeof(o->dstBinding));
}

jlong Java_cz_mg_vulkan_VkCopyDescriptorSet_getDstArrayElementNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstArrayElement);
}

void Java_cz_mg_vulkan_VkCopyDescriptorSet_setDstArrayElementNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstArrayElement, valuePointer, sizeof(o->dstArrayElement));
}

jlong Java_cz_mg_vulkan_VkCopyDescriptorSet_getDescriptorCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorCount);
}

void Java_cz_mg_vulkan_VkCopyDescriptorSet_setDescriptorCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCopyDescriptorSet* o = (VkCopyDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorCount, valuePointer, sizeof(o->descriptorCount));
}


