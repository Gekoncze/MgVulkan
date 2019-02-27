package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import cz.mg.vulkan.jna.enums.VkPhysicalDeviceType;
import java.util.Arrays;
import java.util.List;
import static cz.mg.vulkan.jna.VulkanNative.*;


/**
 *  typedef struct VkPhysicalDeviceProperties {
 *      uint32_t                            apiVersion;
 *      uint32_t                            driverVersion;
 *      uint32_t                            vendorID;
 *      uint32_t                            deviceID;
 *      VkPhysicalDeviceType                deviceType;
 *      char                                deviceName[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE];
 *      uint8_t                             pipelineCacheUUID[VK_UUID_SIZE];
 *      VkPhysicalDeviceLimits              limits;
 *      VkPhysicalDeviceSparseProperties    sparseProperties;
 *  } VkPhysicalDeviceProperties;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceProperties.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceProperties extends Structure {
    public int apiVersion;
    public int driverVersion;
    public int vendorID;
    public int deviceID;
    public VkPhysicalDeviceType.ByValue deviceType;
    public byte[] deviceName = new byte[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE];
    public byte[] pipelineCacheUUID = new byte[VK_UUID_SIZE];
    public VkPhysicalDeviceLimits.ByValue limits;
    public VkPhysicalDeviceSparseProperties.ByValue sparseProperties;

    public VkPhysicalDeviceProperties() {
    }

    public VkPhysicalDeviceProperties(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "apiVersion",
                "driverVersion",
                "vendorID",
                "deviceID",
                "deviceType",
                "deviceName",
                "pipelineCacheUUID",
                "limits",
                "sparseProperties",
        });
    }

    public static class ByReference extends VkPhysicalDeviceProperties implements Structure.ByReference {}
    public static class ByValue extends VkPhysicalDeviceProperties implements Structure.ByValue {}
}
