#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineColorBlendStateCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_getLogicOpEnable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->logicOpEnable);
}

void Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_setLogicOpEnable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->logicOpEnable, valuePointer, sizeof(o->logicOpEnable));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_getLogicOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->logicOp);
}

void Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_setLogicOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->logicOp, valuePointer, sizeof(o->logicOp));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_getAttachmentCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->attachmentCount);
}

void Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_setAttachmentCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->attachmentCount, valuePointer, sizeof(o->attachmentCount));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_getPAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pAttachments);
}

void Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_setPAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pAttachments, &valuePointer, sizeof(o->pAttachments));
}

jlong Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_getBlendConstants(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->blendConstants);
}

void Java_cz_mg_vulkan_vk_VkPipelineColorBlendStateCreateInfo_setBlendConstants(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineColorBlendStateCreateInfo* o = (VkPipelineColorBlendStateCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->blendConstants, valuePointer, sizeof(o->blendConstants));
}


