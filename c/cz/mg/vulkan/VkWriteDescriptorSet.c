#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkWriteDescriptorSet);
}

jlong Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_getDstSet(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstSet));
}

void Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_setDstSet(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    memcpy(&o->dstSet, jniLongToPointer(valueAddress), sizeof(o->dstSet));
}
jlong Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_getDstBinding(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstBinding));
}

void Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_setDstBinding(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    memcpy(&o->dstBinding, jniLongToPointer(valueAddress), sizeof(o->dstBinding));
}
jlong Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_getDstArrayElement(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstArrayElement));
}

void Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_setDstArrayElement(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    memcpy(&o->dstArrayElement, jniLongToPointer(valueAddress), sizeof(o->dstArrayElement));
}
jlong Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_getDescriptorCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorCount));
}

void Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_setDescriptorCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    memcpy(&o->descriptorCount, jniLongToPointer(valueAddress), sizeof(o->descriptorCount));
}
jlong Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_getDescriptorType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&(o->descriptorType));
}

void Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_setDescriptorType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    memcpy(&o->descriptorType, jniLongToPointer(valueAddress), sizeof(o->descriptorType));
}
jlong Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_getPImageInfo(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pImageInfo));
}

void Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_setPImageInfo(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    memcpy(&o->pImageInfo, jniLongToPointer(valueAddress), sizeof(o->pImageInfo));
}
jlong Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_getPBufferInfo(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pBufferInfo));
}

void Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_setPBufferInfo(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    memcpy(&o->pBufferInfo, jniLongToPointer(valueAddress), sizeof(o->pBufferInfo));
}
jlong Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_getPTexelBufferView(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pTexelBufferView));
}

void Java_cz_mg_vulkan_vk_VkWriteDescriptorSet_setPTexelBufferView(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkWriteDescriptorSet* o = (VkWriteDescriptorSet*)jniLongToPointer(address);
    memcpy(&o->pTexelBufferView, jniLongToPointer(valueAddress), sizeof(o->pTexelBufferView));
}

