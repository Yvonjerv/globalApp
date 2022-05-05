package service;

import model.TAddress;

import java.util.List;

public interface AddressService {
    public int deleteAddress(Integer addressid);
    public List<TAddress> getAddresssSelective(TAddress record);
    public int insertAddress(TAddress record);

    public TAddress selectAddressById(Integer addressid);

    public int updateAddress(TAddress record);
}
