#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkCmdProcessCommandsInfoNVX);
}

jlong Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_getObjectTable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectTable);
}

void Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_setObjectTable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectTable, valuePointer, sizeof(o->objectTable));
}

jlong Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_getIndirectCommandsLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->indirectCommandsLayout);
}

void Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_setIndirectCommandsLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->indirectCommandsLayout, valuePointer, sizeof(o->indirectCommandsLayout));
}

jlong Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_getIndirectCommandsTokenCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->indirectCommandsTokenCount);
}

void Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_setIndirectCommandsTokenCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->indirectCommandsTokenCount, valuePointer, sizeof(o->indirectCommandsTokenCount));
}

jlong Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_getPIndirectCommandsTokens(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pIndirectCommandsTokens);
}

void Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_setPIndirectCommandsTokens(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pIndirectCommandsTokens, &valuePointer, sizeof(o->pIndirectCommandsTokens));
}

jlong Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_getMaxSequencesCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSequencesCount);
}

void Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_setMaxSequencesCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSequencesCount, valuePointer, sizeof(o->maxSequencesCount));
}

jlong Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_getTargetCommandBuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->targetCommandBuffer);
}

void Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_setTargetCommandBuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->targetCommandBuffer, valuePointer, sizeof(o->targetCommandBuffer));
}

jlong Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_getSequencesCountBuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sequencesCountBuffer);
}

void Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_setSequencesCountBuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sequencesCountBuffer, valuePointer, sizeof(o->sequencesCountBuffer));
}

jlong Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_getSequencesCountOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sequencesCountOffset);
}

void Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_setSequencesCountOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sequencesCountOffset, valuePointer, sizeof(o->sequencesCountOffset));
}

jlong Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_getSequencesIndexBuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sequencesIndexBuffer);
}

void Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_setSequencesIndexBuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sequencesIndexBuffer, valuePointer, sizeof(o->sequencesIndexBuffer));
}

jlong Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_getSequencesIndexOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sequencesIndexOffset);
}

void Java_cz_mg_vulkan_vk_VkCmdProcessCommandsInfoNVX_setSequencesIndexOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdProcessCommandsInfoNVX* o = (VkCmdProcessCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sequencesIndexOffset, valuePointer, sizeof(o->sequencesIndexOffset));
}


