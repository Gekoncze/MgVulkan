#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineShaderStageCreateInfo);
}

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getStageNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->stage);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setStageNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stage, valuePointer, sizeof(o->stage));
}

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getModuleNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->module);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setModuleNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->module, valuePointer, sizeof(o->module));
}

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getPNameNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pName);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setPNameNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pName, &valuePointer, sizeof(o->pName));
}

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getPSpecializationInfoNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pSpecializationInfo);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setPSpecializationInfoNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSpecializationInfo, &valuePointer, sizeof(o->pSpecializationInfo));
}


