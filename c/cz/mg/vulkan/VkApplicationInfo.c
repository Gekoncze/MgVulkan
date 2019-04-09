#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkApplicationInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkApplicationInfo);
}

jlong Java_cz_mg_vulkan_VkApplicationInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkApplicationInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkApplicationInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkApplicationInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkApplicationInfo_getPApplicationName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pApplicationName);
}

void Java_cz_mg_vulkan_VkApplicationInfo_setPApplicationName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pApplicationName, &valuePointer, sizeof(o->pApplicationName));
}

jlong Java_cz_mg_vulkan_VkApplicationInfo_getApplicationVersion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->applicationVersion);
}

void Java_cz_mg_vulkan_VkApplicationInfo_setApplicationVersion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->applicationVersion, valuePointer, sizeof(o->applicationVersion));
}

jlong Java_cz_mg_vulkan_VkApplicationInfo_getPEngineName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pEngineName);
}

void Java_cz_mg_vulkan_VkApplicationInfo_setPEngineName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pEngineName, &valuePointer, sizeof(o->pEngineName));
}

jlong Java_cz_mg_vulkan_VkApplicationInfo_getEngineVersion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->engineVersion);
}

void Java_cz_mg_vulkan_VkApplicationInfo_setEngineVersion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->engineVersion, valuePointer, sizeof(o->engineVersion));
}

jlong Java_cz_mg_vulkan_VkApplicationInfo_getApiVersion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->apiVersion);
}

void Java_cz_mg_vulkan_VkApplicationInfo_setApiVersion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkApplicationInfo* o = (VkApplicationInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->apiVersion, valuePointer, sizeof(o->apiVersion));
}


