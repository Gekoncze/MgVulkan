#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getDepthClampEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthClampEnable);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setDepthClampEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthClampEnable, valuePointer, sizeof(o->depthClampEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getRasterizerDiscardEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->rasterizerDiscardEnable);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setRasterizerDiscardEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->rasterizerDiscardEnable, valuePointer, sizeof(o->rasterizerDiscardEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getPolygonMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->polygonMode);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setPolygonMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->polygonMode, valuePointer, sizeof(o->polygonMode));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getCullMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->cullMode);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setCullMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->cullMode, valuePointer, sizeof(o->cullMode));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getFrontFace(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->frontFace);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setFrontFace(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->frontFace, valuePointer, sizeof(o->frontFace));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getDepthBiasEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBiasEnable);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setDepthBiasEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBiasEnable, valuePointer, sizeof(o->depthBiasEnable));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getDepthBiasConstantFactor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBiasConstantFactor);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setDepthBiasConstantFactor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBiasConstantFactor, valuePointer, sizeof(o->depthBiasConstantFactor));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getDepthBiasClamp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBiasClamp);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setDepthBiasClamp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBiasClamp, valuePointer, sizeof(o->depthBiasClamp));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getDepthBiasSlopeFactor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthBiasSlopeFactor);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setDepthBiasSlopeFactor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthBiasSlopeFactor, valuePointer, sizeof(o->depthBiasSlopeFactor));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_getLineWidth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->lineWidth);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateCreateInfo_setLineWidth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateCreateInfo* o = (VkPipelineRasterizationStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->lineWidth, valuePointer, sizeof(o->lineWidth));
}


