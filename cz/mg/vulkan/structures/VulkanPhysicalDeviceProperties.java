package cz.mg.vulkan.structures;

import cz.mg.vulkan.enums.VulkanPhysicalDeviceType;
import cz.mg.vulkan.jna.structures.VkPhysicalDeviceProperties;
import cz.mg.vulkan.jna.utilities.ToString;
import cz.mg.vulkan.utilities.Vendor;
import cz.mg.vulkan.utilities.Version;


public class VulkanPhysicalDeviceProperties {
    public final VkPhysicalDeviceProperties structure;

    public VulkanPhysicalDeviceProperties(VkPhysicalDeviceProperties structure) {
        this.structure = structure;
    }

    public Version getApiVersion(){
        return new Version(structure.apiVersion);
    }

    public Version getDriverVersion(){
        return new Version(structure.driverVersion);
    }

    public int getVendorID(){
        return structure.vendorID.intValue();
    }

    public int getDeviceID(){
        return structure.deviceID.intValue();
    }

    public Vendor getVendor(){
        switch(getVendorID()){
            case 0x1002: return Vendor.AMD;
            case 0x10DE: return Vendor.NVIDIA;
            case 0x13B5: return Vendor.ARM;
            case 0x5143: return Vendor.QUALCOMM;
            case 0x8086: return Vendor.INTEL;
            default: return Vendor.OTHER;
        }
    }

    public VulkanPhysicalDeviceType getDeviceType(){
        return VulkanPhysicalDeviceType.fromNativeEnum(structure.deviceType);
    }

    public String getDeviceName(){
        return ToString.textToString(structure.deviceName);
    }

    public byte[] getPipelineCacheUUID(){
        byte[] array = new byte[structure.pipelineCacheUUID.length];
        for(int i = 0; i < array.length; i++) array[i] = structure.pipelineCacheUUID[i].byteValue();
        return array;
    }

    public VulkanPhysicalDeviceLimits getLimits(){
        return new VulkanPhysicalDeviceLimits(structure.limits);
    }

    public VulkanPhysicalDeviceSparseProperties getSparseProperties(){
        return new VulkanPhysicalDeviceSparseProperties(structure.sparseProperties);
    }
}
