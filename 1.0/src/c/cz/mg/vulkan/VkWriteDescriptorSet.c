#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkWriteDescriptorSet_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkWriteDescriptorSet);
}

void Java_cz_mg_vulkan_VkWriteDescriptorSet_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkWriteDescriptorSet));
}

jlong Java_cz_mg_vulkan_VkWriteDescriptorSet_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkWriteDescriptorSet_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkWriteDescriptorSet_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkWriteDescriptorSet_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkWriteDescriptorSet_getDstSetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstSet);
}

void Java_cz_mg_vulkan_VkWriteDescriptorSet_setDstSetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstSet, valuePointer, sizeof(o->dstSet));
}

jlong Java_cz_mg_vulkan_VkWriteDescriptorSet_getDstBindingNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstBinding);
}

void Java_cz_mg_vulkan_VkWriteDescriptorSet_setDstBindingNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstBinding, valuePointer, sizeof(o->dstBinding));
}

jlong Java_cz_mg_vulkan_VkWriteDescriptorSet_getDstArrayElementNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstArrayElement);
}

void Java_cz_mg_vulkan_VkWriteDescriptorSet_setDstArrayElementNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstArrayElement, valuePointer, sizeof(o->dstArrayElement));
}

jlong Java_cz_mg_vulkan_VkWriteDescriptorSet_getDescriptorCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorCount);
}

void Java_cz_mg_vulkan_VkWriteDescriptorSet_setDescriptorCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorCount, valuePointer, sizeof(o->descriptorCount));
}

jlong Java_cz_mg_vulkan_VkWriteDescriptorSet_getDescriptorTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&o->descriptorType);
}

void Java_cz_mg_vulkan_VkWriteDescriptorSet_setDescriptorTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->descriptorType, valuePointer, sizeof(o->descriptorType));
}

jlong Java_cz_mg_vulkan_VkWriteDescriptorSet_getPImageInfoNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(o->pImageInfo);
}

void Java_cz_mg_vulkan_VkWriteDescriptorSet_setPImageInfoNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pImageInfo, &valuePointer, sizeof(o->pImageInfo));
}

jlong Java_cz_mg_vulkan_VkWriteDescriptorSet_getPBufferInfoNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(o->pBufferInfo);
}

void Java_cz_mg_vulkan_VkWriteDescriptorSet_setPBufferInfoNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pBufferInfo, &valuePointer, sizeof(o->pBufferInfo));
}

jlong Java_cz_mg_vulkan_VkWriteDescriptorSet_getPTexelBufferViewNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(o->pTexelBufferView);
}

void Java_cz_mg_vulkan_VkWriteDescriptorSet_setPTexelBufferViewNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pTexelBufferView, &valuePointer, sizeof(o->pTexelBufferView));
}


