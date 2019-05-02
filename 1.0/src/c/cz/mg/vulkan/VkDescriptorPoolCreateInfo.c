#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDescriptorPoolCreateInfo);
}

void Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDescriptorPoolCreateInfo));
}

jlong Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_getMaxSetsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSets);
}

void Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_setMaxSetsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSets, valuePointer, sizeof(o->maxSets));
}

jlong Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_getPoolSizeCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->poolSizeCount);
}

void Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_setPoolSizeCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->poolSizeCount, valuePointer, sizeof(o->poolSizeCount));
}

jlong Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_getPPoolSizesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pPoolSizes);
}

void Java_cz_mg_vulkan_VkDescriptorPoolCreateInfo_setPPoolSizesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDescriptorPoolCreateInfo* o = (VkDescriptorPoolCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pPoolSizes, &valuePointer, sizeof(o->pPoolSizes));
}


