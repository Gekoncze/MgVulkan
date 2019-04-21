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

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getStage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->stage);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setStage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stage, valuePointer, sizeof(o->stage));
}

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getModule(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->module);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setModule(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->module, valuePointer, sizeof(o->module));
}

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getPName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pName);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setPName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pName, &valuePointer, sizeof(o->pName));
}

jlong Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_getPSpecializationInfo(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pSpecializationInfo);
}

void Java_cz_mg_vulkan_VkPipelineShaderStageCreateInfo_setPSpecializationInfo(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineShaderStageCreateInfo* o = (VkPipelineShaderStageCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSpecializationInfo, &valuePointer, sizeof(o->pSpecializationInfo));
}


