#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getPApplicationInfo(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pApplicationInfo);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setPApplicationInfo(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pApplicationInfo, &valuePointer, sizeof(o->pApplicationInfo));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getEnabledLayerCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->enabledLayerCount);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setEnabledLayerCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->enabledLayerCount, valuePointer, sizeof(o->enabledLayerCount));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getPpEnabledLayerNames(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->ppEnabledLayerNames);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setPpEnabledLayerNames(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ppEnabledLayerNames, &valuePointer, sizeof(o->ppEnabledLayerNames));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getEnabledExtensionCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->enabledExtensionCount);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setEnabledExtensionCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->enabledExtensionCount, valuePointer, sizeof(o->enabledExtensionCount));
}

jlong Java_cz_mg_vulkan_VkInstanceCreateInfo_getPpEnabledExtensionNames(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->ppEnabledExtensionNames);
}

void Java_cz_mg_vulkan_VkInstanceCreateInfo_setPpEnabledExtensionNames(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkInstanceCreateInfo* o = (VkInstanceCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->ppEnabledExtensionNames, &valuePointer, sizeof(o->ppEnabledExtensionNames));
}


