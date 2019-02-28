package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import cz.mg.vulkan.jna.enums.VkPhysicalDeviceType;
import cz.mg.vulkan.jna.types.uint32_t;
import cz.mg.vulkan.jna.types.uint8_t;
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
    public uint32_t apiVersion;
    public uint32_t driverVersion;
    public uint32_t vendorID;
    public uint32_t deviceID;
    public VkPhysicalDeviceType deviceType;
    public byte[] deviceName = new byte[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE];
    public uint8_t[] pipelineCacheUUID = new uint8_t[VK_UUID_SIZE];
    public VkPhysicalDeviceLimits limits;
    public VkPhysicalDeviceSparseProperties sparseProperties;

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

    public ByReference byReference(boolean write, boolean read){
        if(write) write();
        ByReference reference = new ByReference(getPointer());
        if(read) reference.read();
        return reference;
    }

    public ByValue byValue(boolean write, boolean read){
        if(write) write();
        ByValue value = new ByValue(getPointer());
        if(read) value.read();
        return value;
    }

    public static class ByReference extends VkPhysicalDeviceProperties implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    public static class ByValue extends VkPhysicalDeviceProperties implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(Pointer p) {
            super(p);
        }
    }
}
