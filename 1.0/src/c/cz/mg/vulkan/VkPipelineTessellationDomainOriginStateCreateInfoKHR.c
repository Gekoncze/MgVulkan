#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkPipelineTessellationDomainOriginStateCreateInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkPipelineTessellationDomainOriginStateCreateInfoKHR);
}

jlong Java_cz_mg_vulkan_VkPipelineTessellationDomainOriginStateCreateInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineTessellationDomainOriginStateCreateInfoKHR* o = (VkPipelineTessellationDomainOriginStateCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkPipelineTessellationDomainOriginStateCreateInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineTessellationDomainOriginStateCreateInfoKHR* o = (VkPipelineTessellationDomainOriginStateCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkPipelineTessellationDomainOriginStateCreateInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineTessellationDomainOriginStateCreateInfoKHR* o = (VkPipelineTessellationDomainOriginStateCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkPipelineTessellationDomainOriginStateCreateInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineTessellationDomainOriginStateCreateInfoKHR* o = (VkPipelineTessellationDomainOriginStateCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkPipelineTessellationDomainOriginStateCreateInfoKHR_getDomainOrigin(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkPipelineTessellationDomainOriginStateCreateInfoKHR* o = (VkPipelineTessellationDomainOriginStateCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->domainOrigin);
}

void Java_cz_mg_vulkan_VkPipelineTessellationDomainOriginStateCreateInfoKHR_setDomainOrigin(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkPipelineTessellationDomainOriginStateCreateInfoKHR* o = (VkPipelineTessellationDomainOriginStateCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->domainOrigin, valuePointer, sizeof(o->domainOrigin));
}


