#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkCmdReserveSpaceForCommandsInfoNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkCmdReserveSpaceForCommandsInfoNVX);
}

jlong Java_cz_mg_vulkan_VkCmdReserveSpaceForCommandsInfoNVX_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkCmdReserveSpaceForCommandsInfoNVX_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkCmdReserveSpaceForCommandsInfoNVX_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkCmdReserveSpaceForCommandsInfoNVX_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkCmdReserveSpaceForCommandsInfoNVX_getObjectTableNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectTable);
}

void Java_cz_mg_vulkan_VkCmdReserveSpaceForCommandsInfoNVX_setObjectTableNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectTable, valuePointer, sizeof(o->objectTable));
}

jlong Java_cz_mg_vulkan_VkCmdReserveSpaceForCommandsInfoNVX_getIndirectCommandsLayoutNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->indirectCommandsLayout);
}

void Java_cz_mg_vulkan_VkCmdReserveSpaceForCommandsInfoNVX_setIndirectCommandsLayoutNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->indirectCommandsLayout, valuePointer, sizeof(o->indirectCommandsLayout));
}

jlong Java_cz_mg_vulkan_VkCmdReserveSpaceForCommandsInfoNVX_getMaxSequencesCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxSequencesCount);
}

void Java_cz_mg_vulkan_VkCmdReserveSpaceForCommandsInfoNVX_setMaxSequencesCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkCmdReserveSpaceForCommandsInfoNVX* o = (VkCmdReserveSpaceForCommandsInfoNVX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxSequencesCount, valuePointer, sizeof(o->maxSequencesCount));
}


