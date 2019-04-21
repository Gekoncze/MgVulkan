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

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getPMessageIdName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pMessageIdName);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setPMessageIdName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pMessageIdName, &valuePointer, sizeof(o->pMessageIdName));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getMessageIdNumber(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->messageIdNumber);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setMessageIdNumber(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->messageIdNumber, valuePointer, sizeof(o->messageIdNumber));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getPMessage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pMessage);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setPMessage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pMessage, &valuePointer, sizeof(o->pMessage));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getQueueLabelCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueLabelCount);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setQueueLabelCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueLabelCount, valuePointer, sizeof(o->queueLabelCount));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getPQueueLabels(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pQueueLabels);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setPQueueLabels(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pQueueLabels, &valuePointer, sizeof(o->pQueueLabels));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getCmdBufLabelCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->cmdBufLabelCount);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setCmdBufLabelCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->cmdBufLabelCount, valuePointer, sizeof(o->cmdBufLabelCount));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getPCmdBufLabels(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pCmdBufLabels);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setPCmdBufLabels(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pCmdBufLabels, &valuePointer, sizeof(o->pCmdBufLabels));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getObjectCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectCount);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setObjectCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectCount, valuePointer, sizeof(o->objectCount));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_getPObjects(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pObjects);
}

void Java_cz_mg_vulkan_VkDebugUtilsMessengerCallbackDataEXT_setPObjects(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsMessengerCallbackDataEXT* o = (VkDebugUtilsMessengerCallbackDataEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pObjects, &valuePointer, sizeof(o->pObjects));
}


