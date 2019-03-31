#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkInstanceCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_getPApplicationInfo(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pApplicationInfo));
}

void Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_setPApplicationInfo(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pApplicationInfo, jniLongToPointer(valueAddress), sizeof(o->pApplicationInfo));
}
jlong Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_getEnabledLayerCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->enabledLayerCount));
}

void Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_setEnabledLayerCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->enabledLayerCount, jniLongToPointer(valueAddress), sizeof(o->enabledLayerCount));
}
jlong Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_getPpEnabledLayerNames(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->ppEnabledLayerNames));
}

void Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_setPpEnabledLayerNames(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->ppEnabledLayerNames, jniLongToPointer(valueAddress), sizeof(o->ppEnabledLayerNames));
}
jlong Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_getEnabledExtensionCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->enabledExtensionCount));
}

void Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_setEnabledExtensionCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->enabledExtensionCount, jniLongToPointer(valueAddress), sizeof(o->enabledExtensionCount));
}
jlong Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_getPpEnabledExtensionNames(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->ppEnabledExtensionNames));
}

void Java_cz_mg_vulkan_vk_VkInstanceCreateInfo_setPpEnabledExtensionNames(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    memcpy(&o->ppEnabledExtensionNames, jniLongToPointer(valueAddress), sizeof(o->ppEnabledExtensionNames));
}

