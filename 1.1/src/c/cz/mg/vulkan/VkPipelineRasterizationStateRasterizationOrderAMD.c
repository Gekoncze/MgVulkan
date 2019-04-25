#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateRasterizationOrderAMD_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineRasterizationStateRasterizationOrderAMD);
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateRasterizationOrderAMD_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateRasterizationOrderAMD* o = (VkPipelineRasterizationStateRasterizationOrderAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateRasterizationOrderAMD_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateRasterizationOrderAMD* o = (VkPipelineRasterizationStateRasterizationOrderAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateRasterizationOrderAMD_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateRasterizationOrderAMD* o = (VkPipelineRasterizationStateRasterizationOrderAMD*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateRasterizationOrderAMD_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateRasterizationOrderAMD* o = (VkPipelineRasterizationStateRasterizationOrderAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineRasterizationStateRasterizationOrderAMD_getRasterizationOrderNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateRasterizationOrderAMD* o = (VkPipelineRasterizationStateRasterizationOrderAMD*)jniLongToPointer(address);
    return jniPointerToLong(&o->rasterizationOrder);
}

void Java_cz_mg_vulkan_VkPipelineRasterizationStateRasterizationOrderAMD_setRasterizationOrderNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineRasterizationStateRasterizationOrderAMD* o = (VkPipelineRasterizationStateRasterizationOrderAMD*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->rasterizationOrder, valuePointer, sizeof(o->rasterizationOrder));
}


