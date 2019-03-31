#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_getQueueCreateInfoCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->queueCreateInfoCount));
}

void Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_setQueueCreateInfoCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->queueCreateInfoCount, jniLongToPointer(valueAddress), sizeof(o->queueCreateInfoCount));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_getPQueueCreateInfos(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pQueueCreateInfos));
}

void Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_setPQueueCreateInfos(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pQueueCreateInfos, jniLongToPointer(valueAddress), sizeof(o->pQueueCreateInfos));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_getEnabledLayerCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->enabledLayerCount));
}

void Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_setEnabledLayerCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->enabledLayerCount, jniLongToPointer(valueAddress), sizeof(o->enabledLayerCount));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_getPpEnabledLayerNames(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->ppEnabledLayerNames));
}

void Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_setPpEnabledLayerNames(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->ppEnabledLayerNames, jniLongToPointer(valueAddress), sizeof(o->ppEnabledLayerNames));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_getEnabledExtensionCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->enabledExtensionCount));
}

void Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_setEnabledExtensionCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->enabledExtensionCount, jniLongToPointer(valueAddress), sizeof(o->enabledExtensionCount));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_getPpEnabledExtensionNames(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->ppEnabledExtensionNames));
}

void Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_setPpEnabledExtensionNames(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->ppEnabledExtensionNames, jniLongToPointer(valueAddress), sizeof(o->ppEnabledExtensionNames));
}
jlong Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_getPEnabledFeatures(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pEnabledFeatures));
}

void Java_cz_mg_vulkan_vk_VkDeviceCreateInfo_setPEnabledFeatures(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceCreateInfo* o = (VkDeviceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pEnabledFeatures, jniLongToPointer(valueAddress), sizeof(o->pEnabledFeatures));
}

