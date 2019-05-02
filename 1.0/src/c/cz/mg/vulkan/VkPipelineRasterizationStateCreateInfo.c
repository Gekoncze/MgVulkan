#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineRasterizationStateCreateInfo);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkPipelineRasterizationStateCreateInfo));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getDepthClampEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthClampEnable);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setDepthClampEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthClampEnable, valuePointer, sizeof(o->depthClampEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getRasterizerDiscardEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->rasterizerDiscardEnable);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setRasterizerDiscardEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->rasterizerDiscardEnable, valuePointer, sizeof(o->rasterizerDiscardEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getPolygonModeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->polygonMode);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setPolygonModeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->polygonMode, valuePointer, sizeof(o->polygonMode));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getCullModeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->cullMode);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setCullModeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->cullMode, valuePointer, sizeof(o->cullMode));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getFrontFaceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->frontFace);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setFrontFaceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->frontFace, valuePointer, sizeof(o->frontFace));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getDepthBiasEnableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBiasEnable);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setDepthBiasEnableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBiasEnable, valuePointer, sizeof(o->depthBiasEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getDepthBiasConstantFactorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBiasConstantFactor);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setDepthBiasConstantFactorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBiasConstantFactor, valuePointer, sizeof(o->depthBiasConstantFactor));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getDepthBiasClampNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBiasClamp);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setDepthBiasClampNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBiasClamp, valuePointer, sizeof(o->depthBiasClamp));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getDepthBiasSlopeFactorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBiasSlopeFactor);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setDepthBiasSlopeFactorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBiasSlopeFactor, valuePointer, sizeof(o->depthBiasSlopeFactor));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getLineWidthNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->lineWidth);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setLineWidthNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->lineWidth, valuePointer, sizeof(o->lineWidth));
}


