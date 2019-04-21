#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfoKHX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDeviceGroupDeviceCreateInfoKHX);
}

jlong Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfoKHX_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfoKHX* o = (VkDeviceGroupDeviceCreateInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfoKHX_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfoKHX* o = (VkDeviceGroupDeviceCreateInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfoKHX_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfoKHX* o = (VkDeviceGroupDeviceCreateInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfoKHX_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfoKHX* o = (VkDeviceGroupDeviceCreateInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfoKHX_getPhysicalDeviceCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfoKHX* o = (VkDeviceGroupDeviceCreateInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(&o->physicalDeviceCount);
}

void Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfoKHX_setPhysicalDeviceCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfoKHX* o = (VkDeviceGroupDeviceCreateInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->physicalDeviceCount, valuePointer, sizeof(o->physicalDeviceCount));
}

jlong Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfoKHX_getPPhysicalDevices(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfoKHX* o = (VkDeviceGroupDeviceCreateInfoKHX*)jniLongToPointer(address);
    return jniPointerToLong(o->pPhysicalDevices);
}

void Java_cz_mg_vulkan_VkDeviceGroupDeviceCreateInfoKHX_setPPhysicalDevices(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDeviceGroupDeviceCreateInfoKHX* o = (VkDeviceGroupDeviceCreateInfoKHX*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pPhysicalDevices, &valuePointer, sizeof(o->pPhysicalDevices));
}


