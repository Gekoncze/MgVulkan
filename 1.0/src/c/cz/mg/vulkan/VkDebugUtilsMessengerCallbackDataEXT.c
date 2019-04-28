#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDebugUtilsMessengerCallbackDataEXT);
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getPMessageIdNameNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pMessageIdName);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setPMessageIdNameNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pMessageIdName, &valuePointer, sizeof(o->pMessageIdName));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getMessageIdNumberNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->messageIdNumber);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setMessageIdNumberNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->messageIdNumber, valuePointer, sizeof(o->messageIdNumber));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getPMessageNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pMessage);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setPMessageNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pMessage, &valuePointer, sizeof(o->pMessage));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getQueueLabelCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueLabelCount);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setQueueLabelCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueLabelCount, valuePointer, sizeof(o->queueLabelCount));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getPQueueLabelsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pQueueLabels);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setPQueueLabelsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pQueueLabels, &valuePointer, sizeof(o->pQueueLabels));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getCmdBufLabelCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->cmdBufLabelCount);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setCmdBufLabelCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->cmdBufLabelCount, valuePointer, sizeof(o->cmdBufLabelCount));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getPCmdBufLabelsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pCmdBufLabels);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setPCmdBufLabelsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pCmdBufLabels, &valuePointer, sizeof(o->pCmdBufLabels));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getObjectCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectCount);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setObjectCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectCount, valuePointer, sizeof(o->objectCount));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getPObjectsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pObjects);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setPObjectsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pObjects, &valuePointer, sizeof(o->pObjects));
}


