#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkCmdReserveSpaceForCommandsInfoNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkCmdReserveSpaceForCommandsInfoNVX);
}

jlong Java_cz_mg_vulkan_vk_VkCmdReserveSpaceForCommandsInfoNVX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkCmdReserveSpaceForCommandsInfoNVX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkCmdReserveSpaceForCommandsInfoNVX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkCmdReserveSpaceForCommandsInfoNVX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkCmdReserveSpaceForCommandsInfoNVX_getObjectTable(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectTable);
}

void Java_cz_mg_vulkan_vk_VkCmdReserveSpaceForCommandsInfoNVX_setObjectTable(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectTable, valuePointer, sizeof(o->objectTable));
}

jlong Java_cz_mg_vulkan_vk_VkCmdReserveSpaceForCommandsInfoNVX_getIndirectCommandsLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->indirectCommandsLayout);
}

void Java_cz_mg_vulkan_vk_VkCmdReserveSpaceForCommandsInfoNVX_setIndirectCommandsLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->indirectCommandsLayout, valuePointer, sizeof(o->indirectCommandsLayout));
}

jlong Java_cz_mg_vulkan_vk_VkCmdReserveSpaceForCommandsInfoNVX_getMaxSequencesCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSequencesCount);
}

void Java_cz_mg_vulkan_vk_VkCmdReserveSpaceForCommandsInfoNVX_setMaxSequencesCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSequencesCount, valuePointer, sizeof(o->maxSequencesCount));
}


