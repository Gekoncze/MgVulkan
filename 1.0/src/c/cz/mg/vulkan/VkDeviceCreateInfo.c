#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceCreateInfo);
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getQueueCreateInfoCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueCreateInfoCount);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setQueueCreateInfoCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueCreateInfoCount, valuePointer, sizeof(o->queueCreateInfoCount));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getPQueueCreateInfos(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pQueueCreateInfos);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setPQueueCreateInfos(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pQueueCreateInfos, &valuePointer, sizeof(o->pQueueCreateInfos));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getEnabledLayerCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->enabledLayerCount);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setEnabledLayerCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->enabledLayerCount, valuePointer, sizeof(o->enabledLayerCount));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getPpEnabledLayerNames(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->ppEnabledLayerNames);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setPpEnabledLayerNames(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ppEnabledLayerNames, &valuePointer, sizeof(o->ppEnabledLayerNames));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getEnabledExtensionCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->enabledExtensionCount);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setEnabledExtensionCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->enabledExtensionCount, valuePointer, sizeof(o->enabledExtensionCount));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getPpEnabledExtensionNames(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->ppEnabledExtensionNames);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setPpEnabledExtensionNames(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ppEnabledExtensionNames, &valuePointer, sizeof(o->ppEnabledExtensionNames));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getPEnabledFeatures(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pEnabledFeatures);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setPEnabledFeatures(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pEnabledFeatures, &valuePointer, sizeof(o->pEnabledFeatures));
}


