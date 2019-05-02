#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineViewportWScalingStateCreateInfoNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineViewportWScalingStateCreateInfoNV);
}

void Java_cz_mg_vulkan_VkPipelineViewportWScalingStateCreateInfoNV_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPipelineViewportWScalingStateCreateInfoNV));
}

jlong Java_cz_mg_vulkan_VkPipelineViewportWScalingStateCreateInfoNV_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineViewportWScalingStateCreateInfoNV_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineViewportWScalingStateCreateInfoNV_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineViewportWScalingStateCreateInfoNV_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineViewportWScalingStateCreateInfoNV_getViewportWScalingEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->viewportWScalingEnable);
}

void Java_cz_mg_vulkan_VkPipelineViewportWScalingStateCreateInfoNV_setViewportWScalingEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->viewportWScalingEnable, valuePointer, sizeof(o->viewportWScalingEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineViewportWScalingStateCreateInfoNV_getViewportCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->viewportCount);
}

void Java_cz_mg_vulkan_VkPipelineViewportWScalingStateCreateInfoNV_setViewportCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->viewportCount, valuePointer, sizeof(o->viewportCount));
}

jlong Java_cz_mg_vulkan_VkPipelineViewportWScalingStateCreateInfoNV_getPViewportWScalingsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(o->pViewportWScalings);
}

void Java_cz_mg_vulkan_VkPipelineViewportWScalingStateCreateInfoNV_setPViewportWScalingsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineViewportWScalingStateCreateInfoNV* o = (VkPipelineViewportWScalingStateCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pViewportWScalings, &valuePointer, sizeof(o->pViewportWScalings));
}


