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

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getQueueCreateInfoCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->queueCreateInfoCount);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setQueueCreateInfoCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->queueCreateInfoCount, valuePointer, sizeof(o->queueCreateInfoCount));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getPQueueCreateInfosNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pQueueCreateInfos);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setPQueueCreateInfosNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pQueueCreateInfos, &valuePointer, sizeof(o->pQueueCreateInfos));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getEnabledLayerCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->enabledLayerCount);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setEnabledLayerCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->enabledLayerCount, valuePointer, sizeof(o->enabledLayerCount));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getPpEnabledLayerNamesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->ppEnabledLayerNames);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setPpEnabledLayerNamesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ppEnabledLayerNames, &valuePointer, sizeof(o->ppEnabledLayerNames));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getEnabledExtensionCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->enabledExtensionCount);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setEnabledExtensionCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->enabledExtensionCount, valuePointer, sizeof(o->enabledExtensionCount));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getPpEnabledExtensionNamesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->ppEnabledExtensionNames);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setPpEnabledExtensionNamesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ppEnabledExtensionNames, &valuePointer, sizeof(o->ppEnabledExtensionNames));
}

jlong Java_cz_mg_vulkan_VkDeviceCreateInfo_getPEnabledFeaturesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pEnabledFeatures);
}

void Java_cz_mg_vulkan_VkDeviceCreateInfo_setPEnabledFeaturesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pEnabledFeatures, &valuePointer, sizeof(o->pEnabledFeatures));
}


