#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkInstanceCreateInfo);
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getPApplicationInfoNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pApplicationInfo);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setPApplicationInfoNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pApplicationInfo, &valuePointer, sizeof(o->pApplicationInfo));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getEnabledLayerCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->enabledLayerCount);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setEnabledLayerCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->enabledLayerCount, valuePointer, sizeof(o->enabledLayerCount));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getPpEnabledLayerNamesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->ppEnabledLayerNames);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setPpEnabledLayerNamesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ppEnabledLayerNames, &valuePointer, sizeof(o->ppEnabledLayerNames));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getEnabledExtensionCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->enabledExtensionCount);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setEnabledExtensionCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->enabledExtensionCount, valuePointer, sizeof(o->enabledExtensionCount));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getPpEnabledExtensionNamesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->ppEnabledExtensionNames);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setPpEnabledExtensionNamesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ppEnabledExtensionNames, &valuePointer, sizeof(o->ppEnabledExtensionNames));
}


