#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDescriptorPoolCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorPoolCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkDescriptorPoolCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDescriptorPoolCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorPoolCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDescriptorPoolCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorPoolCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkDescriptorPoolCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorPoolCreateInfo_getMaxSets(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxSets));
}

void Java_cz_mg_vulkan_vk_VkDescriptorPoolCreateInfo_setMaxSets(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    memcpy(&o->maxSets, jniLongToPointer(valueAddress), sizeof(o->maxSets));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorPoolCreateInfo_getPoolSizeCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->poolSizeCount));
}

void Java_cz_mg_vulkan_vk_VkDescriptorPoolCreateInfo_setPoolSizeCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    memcpy(&o->poolSizeCount, jniLongToPointer(valueAddress), sizeof(o->poolSizeCount));
}
jlong Java_cz_mg_vulkan_vk_VkDescriptorPoolCreateInfo_getPPoolSizes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pPoolSizes));
}

void Java_cz_mg_vulkan_vk_VkDescriptorPoolCreateInfo_setPPoolSizes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pPoolSizes, jniLongToPointer(valueAddress), sizeof(o->pPoolSizes));
}

