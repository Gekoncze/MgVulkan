#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkComputePipelineCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_getStage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->stage));
}

void Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_setStage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->stage, jniLongToPointer(valueAddress), sizeof(o->stage));
}
jlong Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_getLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->layout));
}

void Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_setLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->layout, jniLongToPointer(valueAddress), sizeof(o->layout));
}
jlong Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_getBasePipelineHandle(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->basePipelineHandle));
}

void Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_setBasePipelineHandle(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->basePipelineHandle, jniLongToPointer(valueAddress), sizeof(o->basePipelineHandle));
}
jlong Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_getBasePipelineIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->basePipelineIndex));
}

void Java_cz_mg_vulkan_vk_VkComputePipelineCreateInfo_setBasePipelineIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComputePipelineCreateInfo* o = (VkComputePipelineCreateInfo*)jniLongToPointer(address);
    memcpy(&o->basePipelineIndex, jniLongToPointer(valueAddress), sizeof(o->basePipelineIndex));
}

