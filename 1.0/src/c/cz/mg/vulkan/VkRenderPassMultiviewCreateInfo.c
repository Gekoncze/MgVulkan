#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRenderPassMultiviewCreateInfo);
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getSubpassCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->subpassCount);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setSubpassCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subpassCount, valuePointer, sizeof(o->subpassCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getPViewMasksNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pViewMasks);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setPViewMasksNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pViewMasks, &valuePointer, sizeof(o->pViewMasks));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getDependencyCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->dependencyCount);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setDependencyCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dependencyCount, valuePointer, sizeof(o->dependencyCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getPViewOffsetsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pViewOffsets);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setPViewOffsetsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pViewOffsets, &valuePointer, sizeof(o->pViewOffsets));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getCorrelationMaskCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->correlationMaskCount);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setCorrelationMaskCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->correlationMaskCount, valuePointer, sizeof(o->correlationMaskCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_getPCorrelationMasksNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pCorrelationMasks);
}

void Java_cz_mg_vulkan_VkRenderPassMultiviewCreateInfo_setPCorrelationMasksNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassMultiviewCreateInfo* o = (VkRenderPassMultiviewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pCorrelationMasks, &valuePointer, sizeof(o->pCorrelationMasks));
}


