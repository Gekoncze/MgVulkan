#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkApplicationInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkApplicationInfo);
}

jlong Java_cz_mg_vulkan_vk_VkApplicationInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkApplicationInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkApplicationInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkApplicationInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkApplicationInfo_getPApplicationName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pApplicationName));
}

void Java_cz_mg_vulkan_vk_VkApplicationInfo_setPApplicationName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    memcpy(&o->pApplicationName, jniLongToPointer(valueAddress), sizeof(o->pApplicationName));
}
jlong Java_cz_mg_vulkan_vk_VkApplicationInfo_getApplicationVersion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->applicationVersion));
}

void Java_cz_mg_vulkan_vk_VkApplicationInfo_setApplicationVersion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    memcpy(&o->applicationVersion, jniLongToPointer(valueAddress), sizeof(o->applicationVersion));
}
jlong Java_cz_mg_vulkan_vk_VkApplicationInfo_getPEngineName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pEngineName));
}

void Java_cz_mg_vulkan_vk_VkApplicationInfo_setPEngineName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    memcpy(&o->pEngineName, jniLongToPointer(valueAddress), sizeof(o->pEngineName));
}
jlong Java_cz_mg_vulkan_vk_VkApplicationInfo_getEngineVersion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->engineVersion));
}

void Java_cz_mg_vulkan_vk_VkApplicationInfo_setEngineVersion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    memcpy(&o->engineVersion, jniLongToPointer(valueAddress), sizeof(o->engineVersion));
}
jlong Java_cz_mg_vulkan_vk_VkApplicationInfo_getApiVersion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->apiVersion));
}

void Java_cz_mg_vulkan_vk_VkApplicationInfo_setApiVersion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    memcpy(&o->apiVersion, jniLongToPointer(valueAddress), sizeof(o->apiVersion));
}

