#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkComputePipelineCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkComputePipelineCreateInfo);
}

jlong Java_cz_mg_vulkan_VkComputePipelineCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkComputePipelineCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkComputePipelineCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkComputePipelineCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkComputePipelineCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkComputePipelineCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkComputePipelineCreateInfo_getStageNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->stage);
}

void Java_cz_mg_vulkan_VkComputePipelineCreateInfo_setStageNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stage, valuePointer, sizeof(o->stage));
}

jlong Java_cz_mg_vulkan_VkComputePipelineCreateInfo_getLayoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->layout);
}

void Java_cz_mg_vulkan_VkComputePipelineCreateInfo_setLayoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->layout, valuePointer, sizeof(o->layout));
}

jlong Java_cz_mg_vulkan_VkComputePipelineCreateInfo_getBasePipelineHandleNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->basePipelineHandle);
}

void Java_cz_mg_vulkan_VkComputePipelineCreateInfo_setBasePipelineHandleNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->basePipelineHandle, valuePointer, sizeof(o->basePipelineHandle));
}

jlong Java_cz_mg_vulkan_VkComputePipelineCreateInfo_getBasePipelineIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->basePipelineIndex);
}

void Java_cz_mg_vulkan_VkComputePipelineCreateInfo_setBasePipelineIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->basePipelineIndex, valuePointer, sizeof(o->basePipelineIndex));
}


